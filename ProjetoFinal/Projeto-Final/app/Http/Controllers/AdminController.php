<?php

namespace App\Http\Controllers;
use App\Models\Admin;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class AdminController extends Controller
{
    public function addAdmin(){

        DB::table('admin')
        ->insert(
            [
                'contacto'=> 'bruninhogameplays@email.com',
            ],

            [ //nome campos base dados => valor a ser atribuido
            'nome'=> 'Bruno',
            'localidade'=> 'porto',
            'updated_at'=>now(),
            'created_at'=>now(),

        ]);

       // $users = Db::table('users')->get(); //da um array de objetos

       //$myUser = DB::table('users')
      // ->where('email','sirius@email.com')
      // ->first(); //da um objeto so   //se no dd usar myUser-name ele vai buscar o nome, se fosse um get teria que usar um ciclo for each


     /*  dd($myUser); */


        //return view('users.add_users');
    }
}
