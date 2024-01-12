

 @extends('layouts.femaster')





 @section('content')

 <br>
    <h3>Hello World, página Views.</h3>

    <h5>Tens disponiveis estes links</h5>

    <ul>
        <li><a href="{{route('home')}}">Vai para casa!</a></li>
        <li><a href="{{route('users.all')}}">Ver todos os Utilizadores</a></li>
        <li><a href="{{route('users.add')}}">Adicionar Utilizadores</a></li>
    </ul>

    @endsection

    @section('content2')

    <h6>2 content</h6>

    @endsection
