<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\TaskController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/





Route::get('/ola/', function () {
    return '<h1>Hello Turma de Software</h1>';
})->name('home.hello');


Route::get('/hello/{nome}', function ($nome) {
    return '<h1>Hello Turma de Software</h1>'.$nome;
});



/*Exercicio */

Route::get('/home', [IndexController::class, 'index'])->name('home');

Route::get('/', function () {return view('welcome');})->name('bemvindos');

//users ****************************************************************************************
Route::get('/users/add/',[UserController::class,'addUser'])->name('users.add');

Route::post('/users/create',[UserController::class,'createUser'])->name('users.create');

Route::post('/users/update',[UserController::class,'updateUser'])->name('users.update');

Route::get('/users/all/',[UserController::class,'allUser'])->name('users.all');

Route::get('/users/view/{id}',[UserController::class,'viewUser'])->name('users.view');

Route::get('/users/delete/{id}',[UserController::class,'deleteUser'])->name('users.delete');


//tasks ****************************************************************************************
Route::get('/tasks',[TaskController::class,'seeTask'])->name('tasks.task');

Route::post('/tasks/create',[TaskController::class,'createTask'])->name('tasks.create');

Route::post('/tasks/update',[TaskController::class,'updateTask'])->name('tasks.update');

Route::get('/tasks/add/',[TaskController::class,'addTask'])->name('tasks.add');

Route::get('/tasks/view/{id}', [TaskController::class, 'viewTask'])->name('tasks.view');

Route::get('/tasks/delete/{id}', [TaskController::class, 'deleteTask'])->name('tasks.delete');


//fallback ****************************************************************************************
Route::fallback(function(){return view('main.lost');});
