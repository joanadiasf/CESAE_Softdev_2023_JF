<?php

use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;

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

Route::get('/', function () {
    return view('main.home');
})->name('home');

Route::fallback(function(){
    return view('main.fallback');
});


Route::get('/bandas', [UserController::class, 'viewBandas'])->name('bandas.view');

Route::get('/albuns', [UserController::class, 'viewAlbuns'])->name('albuns.view');


