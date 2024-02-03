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
        Schema::create('formador', function (Blueprint $table) {
        $table->id();
            $table->string('nome')->nullable();
            $table->string('ultimo_nome')->nullable();
            $table->string('localidade')->nullable();
            $table->string('contato')->nullable();
            $table->unsignedBigInteger('disponibilidades_id');
            $table->foreign('disponibilidades_id')->references('id')->on('disponibilidades');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('formador');
    }
};
