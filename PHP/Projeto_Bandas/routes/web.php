<?php


use App\Http\Controllers\AlbumController;
use App\Http\Controllers\BandaController;
use App\Http\Controllers\DashboardController;
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

// ****************************************** B A N D A S
Route::get('/bands/all', [BandaController::class, 'allBandas'])->name('bandas.all');

Route::get('/bands/view/{id}', [BandaController::class, 'viewBanda'])->name('bandas.view');


Route::get('/bands/delete/{id}', [BandaController::class, 'deleteBanda'])->name('bandas.delete');



Route::get('/bands/add', [BandaController::class, 'addBanda'])->name('bandas.add');
Route::post('/bands/create', [BandaController::class, 'createBanda'])->name('bandas.create');
Route::post('/bands/update', [BandaController::class, 'updateBanda'])->name('bandas.update');

// ****************************************** A L B U N S

Route::get('/albums/all', [AlbumController::class, 'allAlbums'])->name('albums.all');

Route::get('/albums/view/{id}', [AlbumController::class, 'viewAlbum'])->name('albums.view');


Route::get('/albums/delete/{id}', [AlbumController::class, 'deleteAlbum'])->name('albums.delete');



Route::get('/albums/add', [AlbumController::class, 'addAlbum'])->name('albums.add');
Route::post('/albums/create', [AlbumController::class, 'createAlbum'])->name('albums.create');
Route::post('/albums/update', [AlbumController::class, 'updateAlbum'])->name('albums.update');

// ****************************************** U S E R S

Route::get('/users/all', [UserController::class, 'allUsers'])->name('users.all');

Route::get('/users/view/{id}', [UserController::class, 'viewUser'])->name('users.view');


Route::get('/users/delete/{id}', [UserController::class, 'deleteUser'])->name('users.delete');



Route::get('/users/add', [UserController::class, 'addUser'])->name('users.add');
Route::post('/users/create', [UserController::class, 'createUser'])->name('users.create');
Route::post('/users/update', [UserController::class, 'updateUser'])->name('users.update');

// ****************************************** D A S H B O A R D 

Route::get('/dashboard/home', [DashboardController::class, 'index'])->name('dashboard.home');
