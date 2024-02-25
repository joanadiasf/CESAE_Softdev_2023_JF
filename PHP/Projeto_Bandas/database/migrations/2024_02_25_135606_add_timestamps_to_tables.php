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
        Schema::table('bandas', function (Blueprint $table) {
            $table->timestamps();;

            
        });

        Schema::table('albuns', function (Blueprint $table) {
            $table->timestamps();;

        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::table('bandas', function (Blueprint $table) {
            $table->dropColumn('updated_at');
        });

        Schema::table('albuns', function (Blueprint $table) {
            $table->dropColumn('updated_at');
        });
    }
};
