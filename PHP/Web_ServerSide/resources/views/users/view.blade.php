@extends('layouts.femaster')
@section('content')

<br>
<h1>Isto e um User</h1>

<h4>Nome: {{$myUser->name}}</h4>
<h4>Phone: {{$myUser->phone}}</h4>
<h4>Address: {{$myUser->adress}}</h4>
<h4>Email: {{$myUser->email}}</h4>
<h4>Password: {{$myUser->password}}</h4>

<br><br>


   

@endsection