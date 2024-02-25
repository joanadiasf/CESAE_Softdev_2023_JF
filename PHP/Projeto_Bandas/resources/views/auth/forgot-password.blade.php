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
        <h3>Recover password</h3>
      
    <form method="POST" action="{{ route('password.email') }}">
        @csrf
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
        </div>
        <button type="submit" class="btn btn-light">Send</button>
    </form>

    </div>

  </div>


  <!-- footer -->
  <footer></footer>
</body>

</html>