import { Component } from '@angular/core';
import { Tutores } from '../../models/tutores';};
import { ActivatedRoute, Router, RouterLink } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { TutoresService } from '../../services/tutores.service';}

@Component({
  selector: 'app-tutores-eliminar',
  standalone: true,
  imports: [],
  templateUrl: './tutores-eliminar.component.html',
  styleUrl: './tutores-eliminar.component.scss'
})
export class TutoresEliminarComponent {

}
