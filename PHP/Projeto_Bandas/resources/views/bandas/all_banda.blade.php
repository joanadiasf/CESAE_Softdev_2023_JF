@extends ('layout.master')

@section('content')
<link rel="stylesheet" href="/css/master.css">

<h3>ALL BANDS</h3>
<br>


<table class="table table-secondary table-hover">
    <thead>
        <tr class="table-secondary">
            <th scope="col">Photo</th>
            <th scope="col">Name</th>
            <th scope="col">Albums</th>
            @auth
            <th></th>
            <th></th>
            @endauth
        </tr>
    </thead>
    <tbody>
       @foreach ($bandas as $banda)
       <tr>
       <td scope="row"><img width="50px" height="50px"
                            src="{{ $banda->photo ? asset('storage/' . $banda->photo) : asset('imagens/nophoto.jpg') }}"></td>
        <td>{{ $banda->name }}</td>
        <td> {{ $banda->nrAlbums }}</td>
        @auth
                        <td><a href="{{ route('bandas.view', $banda->id) }}" class="btn btn-dark">Ver / Actualizar</a></td>
                        @if (Auth::user()->user_type == 1)
                            <td><a href="{{ route('bandas.delete', $banda->id) }}" class="btn btn-danger">Delete</a></td>
                        @endif
         @endauth
        @endforeach
       </tr>
    </tbody>
</table>

@endsection