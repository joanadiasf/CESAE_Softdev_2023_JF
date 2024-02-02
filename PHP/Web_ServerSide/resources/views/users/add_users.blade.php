@extends('layouts.femaster')

@section('content')

<br>

    <h3>Aqui podes adicionar Utilizadores</h3>

    <br><br>

    <div class="container">
    <form method="POST" action="{{route('users.create')}}">
        @csrf
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>
            <input type="texto" value="{{ old('name') }}" name='name' class="form-control" id="exampleFormControlInput1" placeholder="Nome" name="name" required>
            @error('name')
            <div class="alert alert-danger">O nome colocado e invalido</div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email</label>
            <input type="email"  value="{{ old('email') }}"  name='email' class="form-control" id="exampleFormControlInput1" placeholder="email@exemplo.com" name="email" required>
            @error('email')
            <div class="alert alert-danger">O email que colocou ja esta registado</div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Password</label>
            <input type="password" name='password' class="form-control" id="exampleFormControlInput1" placeholder="Password" name="password" required>
        </div>
        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
    <br>

    <a class="btn btn-success" href="{{route('home')}}">Voltar</a>

    <br>
    <br>
    </div>

@endsection

