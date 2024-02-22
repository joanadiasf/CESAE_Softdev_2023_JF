import { Component } from '@angular/core';
import { Tutores } from '../../models/tutores';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { TutoresService } from '../../services/tutores.service';

@Component({
  selector: 'app-tutores-eliminar',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule, RouterLink],
  providers: [TutoresService],
  templateUrl: './tutores-eliminar.component.html',
  styleUrl: './tutores-eliminar.component.scss'
})
export class TutoresEliminarComponent {

  tutor?: Tutores;
  
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private tutoresService: TutoresService
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.tutoresService.getById(id).subscribe(result => this.tutor = result);
    }
  }
 
  cancelarEliminacao(): void {
    this.router.navigate(['']);
  }
 
  confirmarEliminacao(): void {
    if (this.tutor) {
      this.tutoresService.delete(this.tutor).subscribe(() => {
        this.router.navigate(['']);
      });
    }
  }

}
