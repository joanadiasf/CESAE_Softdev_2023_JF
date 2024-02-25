<?php

namespace App\Http\Controllers;

use App\Models\Banda;
use App\Models\Album;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Storage;


class BandaController extends Controller
{
    public function allBandas(){

        $bandas = $this->getAllBandas();

        foreach ($bandas as $banda) {
            // Contar os álbuns associados a esta banda
            $banda->nrAlbums = Album::where('banda_id', $banda->id)->count();
        }

        return view('bandas.all_banda', compact('bandas'));
    }

    public function viewBanda($id){

        $myBanda = Db::table('bandas')
                ->where('bandas.id', $id)
                ->select('bandas.*')
                ->first();

                


        return view('bandas.view_bandas', compact('myBanda'));

    }


    public function updateBanda(Request $request){

        $request->validate([
            'name' => 'required|string|max:50',
        ]);

        $photo = null;

        if($request->has('photo')){
            $photo = Storage::putFile('profilePictures/', $request->photo);
        }

        Banda::where('id', $request->id)
        ->update([
            'name' => $request->name ,
            'photo' =>$photo,
        ]);

        return redirect()->route('bandas.all')->with('message', 'Band updated!!');

    }

    public function addBanda(){

        $bandas = DB::table('bandas')->get();

       

        return view('bandas.add_banda', compact('bandas'));
    }

    public function createBanda(Request $request){

        $request->validate([
            'name' => 'required|string|max:50',
        ]);

        Banda::insert([
            'name' => $request->name ,
            
        ]);

        return redirect()->route('bandas.all')->with('message', 'Band added!!');
    }

    public function deleteBanda($id){
        Db::table('bandas')
        ->where('id', $id)
        ->delete();

        return back();

    }

    private function getAllBandas(){
        $bandas = DB::table('bandas')
                ->get();

                

        return $bandas;
    }
}
