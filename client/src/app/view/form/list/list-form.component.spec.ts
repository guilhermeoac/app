import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';
import { ExploreContainerComponentModule } from '../../../explore-container/explore-container.module';

import { ListFormComponent } from './list-form.component';

describe('Tab3Page', () => {
  let component: ListFormComponent;
  let fixture: ComponentFixture<ListFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ListFormComponent],
      imports: [IonicModule.forRoot(), ExploreContainerComponentModule]
    }).compileComponents();

    fixture = TestBed.createComponent(ListFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
