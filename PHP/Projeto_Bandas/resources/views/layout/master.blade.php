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
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Mono:ital,wght@0,100..700;1,100..700&display=swap"
        rel="stylesheet">
</head>

<body>

    <!-- NAV BAR -->
    <div class="content-page">


        <div class="sidebar">
            <div class="logo-sidebar">
                <a class="logo" href="{{ route('home') }}"><img src="{{ asset('imagens/logo.png') }}" width="100%"
                        alt=""></a>
            </div>
            <div class="side-links">
                <div class="top-bar">
                    <div class="link-menu">
                        <a href="{{ route('home') }}">Home</a>
                    </div>
                    <div class="link-menu">
                        <a href="{{ route('bandas.all') }}">Bands</a>
                    </div>
                    <div class="link-menu">
                        <a href="{{ route('albums.all') }}">Albums</a>
                    </div>
                    
                    <div class="link-menu">
                        <a href="{{ route('users.all') }}">Users</a>
                    </div>
                    
                    <div class="bottom-bar">
                        @if (Route::has('login'))
                        <div class="sm:fixed sm:top-0 sm:right-0 p-6 text-right z-10">
                            @auth

                            <form action="{{ route('logout') }}" method="POST">
                                @csrf
                                <button type="submit" class="btn btn-light">Logout</button>
                            </form>
                            @else
                            <div class="link-menu">
                                <a href="{{ route('login') }}"
                                    class="font-semibold text-gray-600 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white focus:outline focus:outline-2 focus:rounded-sm focus:outline-red-500">Log
                                    in</a>
                            </div>

                            @if (Route::has('users.add'))
                            <div class="link-menu">
                                <a href="{{ route('users.add') }}"
                                    class="ml-4 font-semibold text-gray-600 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white focus:outline focus:outline-2 focus:rounded-sm focus:outline-red-500">Register</a>
                            </div>
                            @endif
                            @endauth
                        </div>
                        @endif
                        <br>
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