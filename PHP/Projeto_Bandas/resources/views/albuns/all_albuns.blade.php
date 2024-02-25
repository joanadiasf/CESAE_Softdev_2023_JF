@extends ('layout.master')

@section('content')
<link rel="stylesheet" href="/css/master.css">

<h3>ALL ALBUMS</h3>
<br>


<table class="table table-secondary table-hover">
    <thead>
        <tr class="table-secondary">
            <th scope="col">Photo</th>
            <th scope="col">Name</th>
            <th scope="col">Release Date</th>
            <th scope="col">Band</th>
            @auth
            <th></th>
            <th></th>
            @endauth
        </tr>
    </thead>
    <tbody>
       @foreach ($albums as $album)
       <tr>
       <td scope="row"><img width="50px" height="50px"
                            src="{{ $album->photo ? asset('storage/' . $album->photo) : asset('imagens/nophoto.jpg') }}"></td>
        <td>{{ $album->name }}</td>
        <td>{{ $album->releaseDate }}</td>
        <td>{{ $album->bandaName }}</td>
        @auth
                        <td><a href="{{ route('albums.view', $album->id) }}" class="btn btn-dark">Ver / Actualizar</a></td>
                        @if (Auth::user()->user_type == 1)
                            <td><a href="{{ route('albums.delete', $album->id) }}" class="btn btn-danger">Delete</a></td>
                        @endif
        @endauth

        @endforeach
       </tr>
    </tbody>
</table>

@endsection