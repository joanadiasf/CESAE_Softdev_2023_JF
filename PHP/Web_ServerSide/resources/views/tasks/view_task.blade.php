@extends('layouts.femaster')

@section('content')

<h1>Nossa tarefas</h1>
<br>

<form method="POST" action="{{route('tasks.update')}}">
        @csrf

        <input type="hidden" name="id" value={{ $myTask->id }} id="">

        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Tarefa</label>
            <input type="texto" value="{{ $myTask->nome }}" name='nome' class="form-control" id="exampleFormControlInput1" placeholder="Tarefa" required>
            @error('nome')
            <div class="alert alert-danger">A tarefa colocada e invalida</div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Descricao</label>
            <input  type="texto"  value="{{ $myTask->description }}"  name='description' class="form-control" id="exampleFormControlInput1" placeholder="Descricao">
            @error('description')
            <div class="alert alert-danger">A descricao e invalida</div>
            @enderror
        </div>


       <form method="GET">
        <select class="custom-select" name="user_id">
            <option value="" selected>Todos os Utilizadores</option>

            @foreach($users as $item)
            <option @if($item->id == request()->query('user_id')) 
                selected @endif value="{{ $item ->id }}">
                    {{ $item->name}} </option>
            @endforeach
        </select>

       </form>
        
       <br>
        <button type="submit" class="btn btn-info">Atualizar</button>
    </form>

@endsection