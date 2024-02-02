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
        Schema::create('cursos', function (Blueprint $table) {
            $table->id();
            $table->string('nome')->nullable();
            $table->string('localidade')->nullable();
            $table->integer('duracao_meses')->nullable();
           // $table->date('cronograma')->nullable();
           $table->integer('horas')->nullable();
           $table->date('data_inicio')->nullable();
           $table->date('data_fim')->nullable();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('Cursos');
    }
};
