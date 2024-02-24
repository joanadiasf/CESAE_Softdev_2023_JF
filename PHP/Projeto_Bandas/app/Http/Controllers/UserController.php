<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    
    public function viewBandas()
    {
        return view('main.bandas');
    }

    public function viewAlbuns(){

        return view('main.albuns');
    }

    public function addUser(){

        return view('users.add_user');
     }
    
   
}
