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
        Schema::create('curso', function (Blueprint $table) {
            $table->id();
                $table->string('nome')->nullable();
                $table->string('localidade')->nullable();
                $table->integer('duracao_meses')->nullable();
                $table->date('data_inicio')->nullable();
                $table->date('data_fim')->nullable();
                $table->unsignedBigInteger('turma_id');
                $table->foreign('turma_id')->references('id')->on('turma');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('curso');

    }
};
