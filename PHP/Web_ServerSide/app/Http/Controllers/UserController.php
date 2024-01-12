<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function addUser(){
        return view('users.add_users');
    }

    public function allUser(){

        $hello='Finalmente vamos para código';
        $helloAgain = 'cucu';

        $daysOfWeek= $this->getWeekDays();
        $info = $this->info();

        return view('users.all_users',compact('hello','helloAgain','daysOfWeek'));
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


}
