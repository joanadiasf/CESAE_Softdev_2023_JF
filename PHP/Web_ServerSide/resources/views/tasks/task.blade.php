@extends('layouts.femaster')

@section('content')

<br>

 <h3>Aqui podes ver todas as Tasks</h3>
 <br><br>

 @if(session('message'))
  <div class="alert alert-success">
    {{session('message')}}
  </div>
 @endif

    <table class="table">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Tarefa</th>
                <th scope="col">Descrição</th>
                <th scope="col">Data</th>
                <th scope="col">Estado</th>
                <th scope="col">Nome</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            @foreach ($tasks as $item)
                <tr>
                    <td scope="row">{{ $item->id }}</td>
                    <td>{{ $item->nome }}</td>
                    <td>{{ $item->description }}</td>
                    <td>{{ $item->due_at }}</td>
                    <td>{{ $item->status }}</td>
                    <td>{{ $item->usname }}</td>
                    <td><a href="{{route('tasks.view',$item->id)}}" class="btn btn-info">Ver/Atualizar</a></td> <!--  botao que vai aceder ao id do user p/ ele ir buscar info -->
                 <td><a href="{{route('tasks.delete',$item->id)}}" class="btn btn-danger">Apagar</a></td>
                </tr>
            @endforeach
        </tbody>
    </table>

    <br><br>

@endsection