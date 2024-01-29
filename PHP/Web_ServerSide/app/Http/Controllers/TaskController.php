<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;


class TaskController extends Controller
{

    public function addTask(){

        DB::table('tasks')
        ->updateOrInsert(
            [
                'name'=> 'estudar html',
            ],

            [ //nome campos base dados => valor a ser atribuido
            'name'=> 'estudar html',
            'user_id'=> '5',
            'updated_at'=>now(),
            'created_at'=>now(),

        ]);

        $tasks = $this->getTask(); //da um array de objetos

        $mytasks = DB::table('tasks')
        ->where('user_id','5')
        ->first();

        return view('tasks.task', compact('tasks'));
    }

    public function seeTask(){

        $tasks = $this->getTask();
//dd($tasks);


        return view('tasks.task',compact ('tasks'));
    }


    public function getTask(){


        $tasks = db::table('tasks')
                ->join('users','user_id','=','users.id') //o = nao tem que se colocar
                ->select('tasks.*','users.name as usname') //como se tem o mesmo nome em atributos, podemos usar o as como em sql
                ->get();

        return $tasks;

    }
}
