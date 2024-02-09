

 @extends('layouts.femaster')





 @section('content')

 <br>
    <h3>Hello World, página Views.</h3>

    <h5>Tens disponiveis estes links</h5>
    <br>
@auth
   <h3>Ola, {{ Auth::user()->name }}</h3>
@endauth

<br>

    <ul>
        <li><a href="{{route('home')}}">Vai para casa!</a></li>
        <li><a href="{{route('users.all')}}">Ver todos os Utilizadores</a></li>
        <li><a href="{{route('users.add')}}">Adicionar Utilizadores</a></li>
        <li><a href="{{route('tasks.task')}}">Tasks</a></li>
        <li><a href="{{route('tasks.add')}}">Add Tasks</a></li>
        <li><a href="{{route('backoffice.view')}}">Backoffice</a></li>

    </ul>

    @endsection

    @section('content2')

    <h5>Dados do Cesae</h5>
    <p>Nome: {{$cesaeInfo['name']}}</p>
    <p>Morada: {{$cesaeInfo['address']}}</p>
    <p>E-mail: {{$cesaeInfo['email']}}</p>

    @endsection
