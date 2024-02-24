<?php

namespace App\Http\Controllers;

use App\Models\Album;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;


class AlbumController extends Controller
{
    public function allAlbums(){

        $albums = $this->getAllAlbums();

        return view('albuns.all_albuns', compact('albums'));
    }

    public function viewAlbum($id){

        $myAlbum = Db::table('albuns')
                ->where('albuns.id', $id)
                ->join('bandas','banda_id','=','bandas.id')
                ->select('albuns.*','bandas.name as bandaName')
                ->first();

        $banda = DB::table('bandas')->get();

        return view('albuns.view_albuns', compact('myAlbum','banda'));

    }

    public function updateAlbum(Request $request){

        $request->validate([
            'name' => 'required|string|max:50',
            'releaseDate' => 'required|date',
            'banda_id' => 'required|integer|exists:bandas,id'
        ]);

        Album::where('id', $request->id)
        ->update([
            'name' => $request->name ,
            'releaseDate' => $request->releaseDate ,
            'banda_id' => $request->banda_id,
        ]);

        return redirect()->route('albums.all')->with('message', 'Album updated!!');

    }

    public function addAlbum(){

        $banda = DB::table('bandas')->get();

        return view('albuns.add_albuns', compact('banda'));
    }

    public function createAlbum(Request $request){

        $request->validate([
            'name' => 'required|string|max:50',
            'releaseDate' => 'required|date',
            'banda_id' => 'required|integer|exists:bandas,id'
        ]);

        Album::insert([
            'name' => $request->name ,
            'releaseDate' => $request->releaseDate ,
            'banda_id' => $request->banda_id,
            
        ]);

        return redirect()->route('albums.all')->with('message', 'Album added!!');
    }

    public function deleteAlbum($id){
        Db::table('albuns')
        ->where('id', $id)
        ->delete();

        return back();

    }

    private function getAllAlbums(){
        $albuns = DB::table('albuns')
                ->join('bandas','banda_id','=','bandas.id')
                ->select('albuns.*','bandas.name as bandaName')
                ->get();

        return $albuns;
    }
}
