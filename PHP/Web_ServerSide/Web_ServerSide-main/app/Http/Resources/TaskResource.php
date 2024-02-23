<?php

namespace App\Http\Resources;
use App\Models\Task;

use Illuminate\Http\Request;
use Illuminate\Http\Resources\Json\JsonResource;

class TaskResource extends JsonResource
{
    /**
     * Transform the resource into an array.
     *
     * @return array<string, mixed>
     */
    public function toArray($request)
    {
        return [
            'task_name' => $this->name,
            'task_description' => $this->description,
        ];
    }  
}