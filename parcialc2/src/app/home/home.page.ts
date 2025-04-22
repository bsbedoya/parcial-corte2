import { Component } from '@angular/core';
import { FechayhoraComponent } from '../fechayhora/fechayhora.component';
import { CommonModule } from '@angular/common';
import {IonicModule} from '@ionic/angular';



@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: true,
  imports: [FechayhoraComponent,CommonModule,IonicModule],
})
export class HomePage {
  constructor() {}
}
