@extends ('layout.master')

@section('content')
<link rel="stylesheet" href="/css/master.css">


@auth

@if ($message)
<div class="alert alert-light">
    <h3>Olá, {{Auth::user()->name}}</h3>
</div>
@endif

<div class="container text-center">
    <div class="row">
        <div class="col">
            <div class="card text-center mb-3" style="width: 18rem;">
               
                <div class="card-body">
                    <h5 class="card-title" style="font-size: 30px;">{{Auth::user()->name}}</h5>
                    <p style="color: #0f0f0f;">Email: {{Auth::user()->email}} </p>
                    <a class="btn btn-dark" href="{{ route('home') }}">Go Home</a>
                </div>
            </div>
        </div>
    </div>
</div>
@endauth



@endsection