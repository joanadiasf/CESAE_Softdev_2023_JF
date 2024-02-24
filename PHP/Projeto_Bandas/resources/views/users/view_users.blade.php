@extends ('layout.master')

@section('content')
<link rel="stylesheet" href="/css/master.css">


<h3>USERS</h3>
<form method="POST" action="{{ route('users.update') }}">
    @csrf
    <input type="hidden" name="id" value="{{ $myUser->id }}" id="">
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Name</label>
        <input type="text" value="{{ $myUser->name }}" name="name" class="form-control" id="exampleFormControlInput1"
            placeholder="Nome" required>
        @error('name')
        <div class='alert alert-danger'>
            Invalid Name
        </div>
        @enderror
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Photo</label>
        <input accept="image/*" type="text" value="{{ $myUser->photo }}" name="photo" class="form-control"
            id="exampleFormControlInput1">
        @error('photo')
        <div class='alert alert-danger'>
            Invalid Photo
        </div>
        @enderror
    </div>

    <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email</label>
            <input disabled value="{{ $myUser->email }}" type="email" name="email" class="form-control"
                id="exampleFormControlInput1" placeholder="email@exemplo.com" required>
           
        </div>


    <button type="submit" class="btn btn-primary">Update</button>
</form>

@endsection