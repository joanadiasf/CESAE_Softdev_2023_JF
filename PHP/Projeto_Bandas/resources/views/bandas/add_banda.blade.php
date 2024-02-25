@extends ('layout.master')

@section('content')
<link rel="stylesheet" href="/css/master.css">

<br>
<h3>Add Band</h3>
<br>

<form method="POST" action="{{ route('bandas.create') }}" enctype="multipart/form-data">
    @csrf
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Name</label>
        <input type="text" value="{{ old('name') }}" name="name" class="form-control" id="exampleFormControlInput1"
            placeholder="Name" required>
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
        <div class="alert alert-danger">
            Invalid Photo
        </div>
        @enderror
    </div>

    <button type="submit" class="btn btn-light">Save</button>
</form>


@endsection