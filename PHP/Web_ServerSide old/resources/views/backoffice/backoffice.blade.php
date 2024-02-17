@extends('layouts.femaster')

@section('content')

<br>
<h3>Ola {{ Auth::user()->name }}</h3>


<!-- So aparece se autenticado-->
@auth
    @if(Auth::user()->user_type == 1)
    <!-- Alerta -->
    <div class="alert alert-info" role="alert">
        Conta de Administrador
    </div>
    @endif
@endauth

@endsection