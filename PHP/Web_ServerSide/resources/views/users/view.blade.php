@extends('layouts.femaster')
@section('content')

<br>
<h1>Ver / Atualizar dados de {{$myUser->name}}</h1>
<br>

<form method="POST" action="{{route('users.update')}}">
        @csrf

        <input type="hidden" name="id" value={{ $myUser->id }} id="">

        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>
            <input type="texto" value="{{ $myUser->name }}" name='name' class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>
            @error('name')
            <div class="alert alert-danger">O nome colocado e invalido</div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email</label>
            <input disabled type="email"  value="{{ $myUser->email }}"  name='email' class="form-control" id="exampleFormControlInput1" placeholder="email@exemplo.com" required>
            @error('email')
            <div class="alert alert-danger">O email que colocou ja esta registado</div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Morada</label>
            <input type="texto" value="{{ $myUser->adress }}" name='adress' class="form-control" id="exampleFormControlInput1" placeholder="Morada" >
            @error('adress')
            <div class="alert alert-danger">A morada que colocou esta invalida</div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Telemovel</label>
            <input type="texto" value="{{ $myUser->phone }}" name='phone' class="form-control" id="exampleFormControlInput1" placeholder="Telemovel" >
            @error('name')
            <div class="alert alert-danger">O numero de telemovel colocado e invalido</div>
            @enderror
        </div>
       
        <button type="submit" class="btn btn-info">Atualizar</button>
    </form>

   

@endsection