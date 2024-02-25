@extends ('layout.master')

@section('content')
<link rel="stylesheet" href="/css/master.css">

<h3>ALL USERS</h3>
<br>


<table class="table table-secondary table-hover">
    <thead>
        <tr class="table-secondary">
            <th scope="col">Photo</th>
            <th scope="col">Name</th>
            <th scope="col">E-MAIL</th>
            <th></th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        @foreach ($users as $user)
        <tr>
            <td scope="row"><img width="50px" height="50px"
                    src="{{ $user->photo ? asset('storage/' . $user->photo) : asset('imagens/nophoto.jpg') }}"></td>
            <td>{{ $user->name }}</td>
            <td>{{ $user->email }}</td>
            <td><a href="{{ route('users.view', $user->id) }}" class="btn btn-dark">Ver / Actualizar</a></td>

            <td><a href="{{ route('users.delete', $user->id) }}" class="btn btn-danger">Delete</a></td>


            @endforeach
        </tr>
    </tbody>
</table>

@endsection