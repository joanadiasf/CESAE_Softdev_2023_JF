@extends('layouts.femaster')




 @section('content')

 <br>

 <h3>Aqui podes ver todos os Utiliazdores</h3>
 <br><br>


    <table class="table">

        <thead>
            <tr>
              <th scope="col">ID</th>
              <th scope="col">NOME</th>
              <th scope="col">TELEMÓVEL</th>
              <th scope="col">E-MAIL</th>
            </tr>
          </thead>
        <tbody>
            @foreach ($contacts as $item)

             <tr>
                 <th scope="row">{{$item['id']}}</th>
                 <td>{{$item['name']}}</td>
                 <td>{{$item['phone']}}</td>
                 <td>{{$item['email']}}</td>
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

