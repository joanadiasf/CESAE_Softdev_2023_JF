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
        Schema::create('formadores', function (Blueprint $table) {
            $table->id();
            $table->string('nome')->nullable();
            $table->string('localidade')->nullable();
            $table->string('contacto')->nullable();
            //$table->string('tipo_horario')->nullable();
            //$table->string('tipo_formacao')->nullable();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('formadores');

    }
};
