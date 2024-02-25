@extends ('layout.master')

@section('content')
<link rel="stylesheet" href="/css/master.css">


<h3>BANDS</h3>
<form method="POST" action="{{ route('bandas.update') }}" enctype="multipart/form-data">
    @csrf
    <input type="hidden" name="id" value="{{ $myBanda->id }}" id="">
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Name</label>
        <input type="text" value="{{ $myBanda->name }}" name="name" class="form-control" id="exampleFormControlInput1"
            placeholder="Nome" required>
        @error('name')
        <div class='alert alert-danger'>
            Invalid Name
        </div>
        @enderror
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Photo</label>
        <input accept="image/*" type="file" name="photo" class="form-control" id="exampleFormControlInput1">
        @error('photo')
        <div class='alert alert-danger'>
            Invalid Photo
        </div>
        @enderror
    </div>


    <button type="submit" class="btn btn-light">Update</button>
</form>

@endsection