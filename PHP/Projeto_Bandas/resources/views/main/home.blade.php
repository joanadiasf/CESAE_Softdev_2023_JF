@extends ('layout.master')

@section('content')

<h3>HOMEEEEEEEE</h3>

<br>



<div class="container text-center">
  <div class="row">
    <div class="col">
    <div class="card text-center mb-3" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">BANDS</h5>
    <a class="btn btn-dark" href="{{ route('bandas.add') }}">Add Bands</a>
  </div>
</div>
    </div>
    <div class="col">
    <div class="card text-center mb-3" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">ALBUMS</h5>
    <a class="btn btn-dark" href="{{ route('albums.add') }}">Add Albums</a>
  </div>
</div>
    </div>
    <div class="col">
    <div class="card text-center mb-3" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">USERS</h5>
    <a class="btn btn-dark" href="{{ route('users.add') }}">Add Users</a>
  </div>
</div>
    </div>
  </div>
</div>


<br><br>




@endsection