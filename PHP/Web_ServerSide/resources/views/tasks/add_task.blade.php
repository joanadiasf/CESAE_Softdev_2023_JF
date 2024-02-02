@extends('layouts.femaster')

@section('content')

<br>

    <h3>Aqui podes adicionar Tarefas</h3>

    <br><br>

    <div class="container">
    <form method="POST" action="{{route('tasks.create')}}">
        @csrf
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Tarefa</label>
            <input type="texto" value="{{ old('nome') }}" name='nome' class="form-control" id="exampleFormControlInput1" placeholder="Nome"  required>
            @error('nome')
            <div class="alert alert-danger">A tarefa colocada e invalida</div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Descricao</label>
            <input type="texto"  value="{{ old('description') }}"  name='description' class="form-control" id="exampleFormControlInput1" placeholder="Descricao" >
            @error('description')
            <div class="alert alert-danger">A descricao e invalida</div>
            @enderror
        </div>
        
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">User ID</label>
           <select name="user_id" id="" required>
                @foreach($users as $user)
                <option @if($user->id == request()->query('user_id')) 
                selected @endif value="{{ $user ->id }}">
                    {{ $user->name}} </option>
            @endforeach
           </select>
        </div>

        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
    <br>

    <a class="btn btn-success" href="{{route('home')}}">Voltar</a>

    <br>
    <br>
    </div>

@endsection
