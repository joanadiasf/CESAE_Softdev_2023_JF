@extends ('layout.master')

@section('content')
<link rel="stylesheet" href="/css/master.css">

<br>
<h3>Add User</h3>
<br>

<form method="POST" action="{{ route('users.create') }}">
    @csrf
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Name</label>
        <input type="text" value="{{ old('name') }}" name="name" class="form-control" id="exampleFormControlInput1"
            placeholder="Name" required>
        @error('name')
        <div class="alert alert-danger">
            Invalid Name
        </div>
        @enderror
    </div>

    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Email</label>
        <input value="{{ old('email') }}" type="email" name="email" class="form-control" id="exampleFormControlInput1"
            placeholder="email@exemple.com" required>
        @error('email')
        <div class="alert alert-danger">
            Email already exists
        </div>
        @enderror
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Password</label>
        <input value="" type="password" name="password" class="form-control" id="exampleFormControlInput1"
            placeholder="Password" required>
    </div>
    <button type="submit" class="btn btn-primary">Save</button>
</form>
@endsection