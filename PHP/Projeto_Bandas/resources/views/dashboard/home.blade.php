@extends ('layout.master')

@section('content')

@auth

    @if ($message)
        <div class="alert alert-success">
         <h3>Olá, {{Auth::user()->name}}</h3>
        </div>
    @endif
    
@endauth

@endsection