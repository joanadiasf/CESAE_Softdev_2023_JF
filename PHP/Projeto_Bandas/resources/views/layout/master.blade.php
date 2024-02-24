<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>The Band View</title>

    <link rel="shortcut icon" href="/imagens/logo.png" type="image/x-icon">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"> 
    <link rel="stylesheet" href="/css/master.css">

    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto+Mono:ital,wght@0,100..700;1,100..700&display=swap" rel="stylesheet">
</head>

<body>

    <!-- NAV BAR -->
    <div class="content-page">


        <div class="sidebar">
            <div class="logo-sidebar">
                <a class="logo" href="#"><img src="{{ asset('imagens/logo.png') }}" width="100%" alt=""></a>
            </div>
            <div class="side-links">
                <div class="top-bar">
                    <div class="link-menu">
                        <a href="{{ route('home') }}"><i class="bi bi-grid"></i>Home</a>
                    </div>
                    <div class="link-menu">
                        <a href="{{ route('bandas.view') }}"><i class="bi bi-people"></i>Bands</a>
                    </div>
                    <div class="link-menu">
                        <a href="{{ route('albuns.view') }}"><i class="bi bi-journal-code"></i>Albums</a>
                    </div>
                  
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <div class="container">
        <br>
        @yield('content')
    </div>

</body>

<footer></footer>

</html>