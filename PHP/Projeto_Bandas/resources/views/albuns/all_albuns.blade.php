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
        </tr>
    </thead>
    <tbody>
       @foreach ($albums as $album)
       <tr>
        <td>Photo</td>
        <td>{{ $album->name }}</td>
        <td>{{ $album->releaseDate }}</td>
        <td>{{ $album->bandaName }}</td>

        @endforeach
       </tr>
    </tbody>
</table>

@endsection