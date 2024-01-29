<?php

namespace App\Http\Controllers;
use App\Models\User;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class UserController extends Controller
{
    public function addUser(){

        DB::table('users')
        ->updateOrInsert(
            [
                'email'=> 'darkLord@email.com',
            ],

            [ //nome campos base dados => valor a ser atribuido
            'name'=> 'Voldmort',
            'password'=> 'voldy',
            'updated_at'=>now(),
            'created_at'=>now(),

        ]);

        $users = Db::table('users')->get(); //da um array de objetos

       $myUser = DB::table('users')
       ->where('email','sirius@email.com')
       ->first(); //da um objeto so   //se no dd usar myUser-name ele vai buscar o nome, se fosse um get teria que usar um ciclo for each


     /*  dd($myUser); */


        return view('users.add_users');
    }

    public function allUser(){

        $hello='Finalmente vamos para código';
        $helloAgain = 'cucu';

        $daysOfWeek= $this->getWeekDays();
        $info = $this->info();

        //dd($info);  //debug

        $users = $this->getContacts();

       /* dd($contacts); */

        return view('users.all_users',compact('hello','helloAgain','daysOfWeek','info','users'));
    }

    public function viewUser($id){ //para ele ir buscar os dados e apresentar na blade do view

        $myUser = DB::table('users')
            ->where('id',$id)
            ->first();

        return view('users.view', compact ('myUser'));
    }

    private function getWeekDays(){

         $daysOfWeek = ['Segunda','Terça','Quarta','Quinta'];

         return $daysOfWeek;
    }

    private function info(){

        $courseInfo = [ //array associativo - em vez de posições tens "keys"
                                                         //indices
            'name'=> 'Software Developer',               //0
            'year'=> 2024,                               //1
            'modules'=> ['PHP','WebServices','Java'],    //2
            ['Teste',4,'Sofia','João'] //array sem "key" //3
        ];

        return $courseInfo;
    }

    private function getContacts(){

      /*  $contacts = [
            ['id'=> 1,'name'=>'Sara','phone'=>'985654455','email'=>'sara@email.com'],
            ['id'=> 2,'name'=>'Bruno','phone'=>'985654455','email'=>'bruno@email.com'],
            ['id'=> 3,'name'=>'Márcia','phone'=>'985654455','email'=>'marcia@email.com']
        ]; */

        $users = db::table('users')
            ->whereNull('updated_at')
            ->get();  
       //$users = User::get();   = DB

        return $users;
    }


}
