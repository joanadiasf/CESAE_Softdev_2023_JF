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
        </tr>
    </thead>
    <tbody>
       @foreach ($users as $user)
       <tr>
        <td>Photo</td>
        <td>{{ $user->name }}</td>
        <td>{{ $user->email }}</td>

        @endforeach
       </tr>
    </tbody>
</table>

@endsection