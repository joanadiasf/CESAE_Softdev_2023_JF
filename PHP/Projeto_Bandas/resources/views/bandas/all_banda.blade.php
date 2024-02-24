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
        </tr>
    </thead>
    <tbody>
       @foreach ($bandas as $banda)
       <tr>
        <td>Photo</td>
        <td>{{ $banda->name }}</td>
        <td> nr Albuns</td>
        @endforeach
       </tr>
    </tbody>
</table>

@endsection