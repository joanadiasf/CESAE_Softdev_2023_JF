<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>PHP</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <link rel="stylesheet" href="style.css">

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"
    defer></script>

</head>

<body>
  <nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">PHP </a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="{{route('home')}}">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="{{route('users.add')}}">Add Users</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="{{route('users.all')}}">All Users</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="{{route('tasks.task')}}">Tasks</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="{{route('tasks.add')}}">Add Tasks</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="{{route('backoffice.view')}}">Backoffice</a>
          </li>
        </ul>
        <!-- Login Code -->
        @if (Route::has('login'))
        <div class="sm:fixed sm:top-0 sm:right-0 p-6 text-right z-10">
          @auth
          <!-- Login -->
          <a href="{{ url('/home') }}"
            class="font-semibold text-gray-600 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white focus:outline focus:outline-2 focus:rounded-sm focus:outline-red-500">Home</a>

          <!-- Logout -->
          <form action="{{ route('logout') }}" method="POST">
            @csrf <!-- Nunca esquecer de por isso no form -->
            <button type="submit" class="btn btn-warning">Logout</button>
          </form>

          @else
          <a href="{{ route('login') }}"
            class="font-semibold text-gray-600 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white focus:outline focus:outline-2 focus:rounded-sm focus:outline-red-500">Log
            in</a>

          @if (Route::has('users.add'))
          <a href="{{ route('users.add') }}"
            class="ml-4 font-semibold text-gray-600 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white focus:outline focus:outline-2 focus:rounded-sm focus:outline-red-500">Register</a>
          @endif
          @endauth
        </div>
        @endif

      </div>
    </div>
  </nav>


  <div class="container">



    @yield('content')
    <br>
    <div class="mr-5" ml-5>

      @yield('content2')
    </div>

  </div>

  <footer class="fixed-bottom">
    <div class="card text-center">
      <div class="card-body">
        <a href="{{route('bemvindos')}}" class="btn btn-primary">Home</a>
      </div>
    </div>
  </footer>



</body>

</html>