@extends('layouts.femaster')

 @section('content')

<br>
<form method="POST" action="{{ route('login') }}">
    @csrf
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input name="password" type="password" class="form-control" id="exampleInputPassword1">
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
  <a href="{{ route('password.request') }}">Esqueceu-se da palavra-passe?</a>
</form>

@endsection