<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('admin', function (Blueprint $table) {
            $table->id();
            $table->string('nome')->nullable();
            $table->string('localidade')->nullable();
            $table->string('contacto')->nullable();

            //$table->unsignedBigInteger('cursos_id');
            //$table->foreign('cursos_id')->references('id')->on('cursos');

           // $table->foreignId('cursos_id')->constrained();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('admin');
    }
};
