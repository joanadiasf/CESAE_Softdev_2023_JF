<!DOCTYPE html>

<html lang="en">

<head> 
  <meta charset="UTF-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>The Band View</title>  
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"> 
  <link rel="stylesheet" href="/css/login-fallback.css"> 
  
</head>

<body>

  <!-- ************************************************************************************* -->

  <div class="conteiner-login">

    <img class="image-login" src="{{ asset('imagens/logo.png') }}" alt="">
    <div class="conteiner-right-content">
      <h3>New Password</h3>
      
    <form method="POST" action="{{ route('password.update') }}">
        @csrf
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input name="email" value="{{ request()->email }}" type="email" class="form-control" id="exampleInputEmail1"
                aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input name="password" type="password" class="form-control" id="exampleInputPassword1">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input name="password_confirmation" type="password" class="form-control" id="exampleInputPassword1">
        </div>
        <input type="hidden" name="token" value="{{ request()->route('token') }}">
        <button type="submit" class="btn btn-primary">Submit</button>

    </form>

    </div>

  </div>


  <!-- footer -->
  <footer></footer>
</body>

</html>