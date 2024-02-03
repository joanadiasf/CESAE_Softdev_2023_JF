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
        Schema::create('modulos_formador', function (Blueprint $table) {
            
                $table->unsignedBigInteger('modulos_id');
                $table->foreign('modulos_id')->references('id')->on('modulos');
                $table->unsignedBigInteger('formador_id');
                $table->foreign('formador_id')->references('id')->on('formador');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('modulos_formador');
    }
};
