@extends('layouts.femaster')




 @section('content')

 <br>

 <h3>Aqui podes ver todos os Utilizadores</h3>
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
              <th scope="col">NOME</th>
              <th scope="col">TELEMÓVEL</th>
              <th scope="col">E-MAIL</th>
              <th></th>
              <th></th>
            </tr>
          </thead>
        <tbody>
            @foreach ($users as $item)

             <tr>
                 <th scope="row">{{$item->id}}</th>
                 <td>{{$item->name}}</td>
                 <td>{{$item->phone}}</td>
                 <td>{{$item->email}}</td>
                 <td><a href="{{route('users.view',$item->id)}}" class="btn btn-info">Ver/Editar</a></td> <!--  botao que vai aceder ao id do user p/ ele ir buscar info -->
                 <td><a href="{{route('users.delete',$item->id)}}" class="btn btn-danger">Apagar</a></td>
             </tr>

            @endforeach
            
         </tbody>
    </table>

<br><br>

<h3>Mais opções:</h3>
<ul>
  <li><a href="{{route('home')}}">Vai para casa!</a></li>
  <li><a href="{{route('users.add')}}">Adicionar Utilizadores</a></li>
</ul>

<br><br>

{{-- <h3>Testes Variáveis</h3>

    <p>{{$hello}}</p>
    <p>{{$helloAgain}}</p>
    <p>{{$daysOfWeek[2]}}</p>
    <p>{{$info['name']}}</p>
    <p>{{$info['modules'][0]}}</p>
    <p>{{$info[0][3]}}</p> --}}
    @endsection

