@extends ('layout.master')

@section('content')
<link rel="stylesheet" href="/css/master.css">


<h3>HOME</h3>

<br>



<h1>Unleash the Sound Waves &#x1F918;</h1>

<p>Join us on an epic musical journey filled with raw energy and passion. From heart-pounding rhythms to soul-stirring
  lyrics, our songs transcend boundaries and ignite spirits. Feel the adrenaline rush as guitar riffs electrify the air,
  while every beat resonates with your soul. Embrace the essence of rock as we unleash the power of sound, uniting
  hearts and minds in a symphony of emotions. Get ready to lose yourself in the magic of our music, where every chord
  strummed and every lyric sung speaks volumes. Let's rock the world together!</p>




@auth
@if (Auth::user()->user_type == 1)
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
@endif
@endauth

<br><br>



@endsection