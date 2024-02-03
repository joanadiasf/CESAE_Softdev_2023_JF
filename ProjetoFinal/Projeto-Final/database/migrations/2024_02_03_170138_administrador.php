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
        Schema::create('administrador', function (Blueprint $table) {
            $table->id();
                $table->string('nome')->nullable();
                $table->string('localidade')->nullable();
                $table->string('contato')->nullable();
                $table->unsignedBigInteger('curso_id');
                $table->foreign('curso_id')->references('id')->on('curso');
                $table->unsignedBigInteger('turma_id');
                $table->foreign('turma_id')->references('id')->on('turma');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('administrador');

    }
};
