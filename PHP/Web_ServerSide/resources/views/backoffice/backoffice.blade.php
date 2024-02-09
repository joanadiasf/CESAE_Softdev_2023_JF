@extends('layouts.femaster')

@section('content')

<br>
<h3>Ola {{ Auth::user()->name }}</h3>


<!-- So aparece se autenticado-->
@auth   
<!-- Alerta -->
<div class="alert alert-info" role="alert">
    Conta de Administrador
</div>
@endauth

@endsection