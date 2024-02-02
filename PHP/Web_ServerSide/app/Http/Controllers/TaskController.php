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
                'nome'=> 'estudar html',
            ],

            [ //nome campos base dados => valor a ser atribuido
            'nome'=> 'estudar html',
            'user_id'=> '3',
            'updated_at'=>now(),
            'created_at'=>now(),

        ]);

        $tasks = $this->getTask(); //da um array de objetos
        $users=DB::table('users')->get();

        $mytasks = DB::table('tasks')
        ->where('user_id','3')
        ->first();

        return view('tasks.add_task', compact('tasks','users'));
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

    public function viewTask($id){ //para ele ir buscar os dados e apresentar na blade do view

        $myTask = DB::table('tasks')
        ->where('tasks.id', $id)
        ->join('users', 'user_id','=','users.id')
        ->select('tasks.*', 'users.name as usname')
        ->first();

        $users= DB::table('users')
            ->get();

        return view('tasks.view_task', compact ('myTask','users'));
    }


    public function deleteTask($id){

        
        db::table('tasks')
            ->where('id',$id)
            ->delete();

        return back(); //volta a retornar pra onde estava
    }

    public function createTask(Request $request){
       
        //dd($request->all()); //all vai buscar tudo
  
        $request->validate([
          'nome'=>'required|string|max:50',
          'usname'=>'required',
  
        ]);
  
        User::insert([
  
          'nome' => $request->name, //lado esq nome na coluna sql || lado direito variavel 
          'usname' => $request->email,
          
  
        ]);
  
        return redirect()->route('tasks.task')->with('message','Tarefa adicionada com sucesso!');
  
    }

    public function updateTask(Request $request){

        $request->validate([
            'description'=>'string|max:200',
          ]);

          User::where('id',$request->id)
            -> update([
  
                'nome' => $request->nome, //lado esq nome na coluna sql || lado direito variavel 
                'usname' => $request->usname,
                'description' => $request->description,
  
        ]);

        return redirect()->route('tasks.task')->with('message','Tarefa atualizada!');

    }

}